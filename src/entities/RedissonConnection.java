package entities;

import constValues.ConnectionParamsConst;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonConnection {
    private String host;
    private int port, timeout;
    private Config config;
    private RedissonClient redissonClient;

    /**
     * start with default values (see constValues.ConnectionParamsConst)
     */
    public RedissonConnection() {
        this(ConnectionParamsConst.DEFAULT_HOST, ConnectionParamsConst.DEFAULT_PORT, ConnectionParamsConst.DEFAULT_TIMOUT);
    }

    public RedissonConnection(String host, int port, int timeout) {
        this.host = host;
        this.port = port;
        this.timeout = timeout;
        config();
    }

    public void connect(){
        redissonClient = Redisson.create(config);
    }

    private void config(){
        config = new Config();
        config.useSingleServer().setAddress(createConnectionAddress()).setTimeout(timeout);
    }

    public Config getConfig() {
        return config;
    }

    public RedissonConnection setConfig(Config config) {
        this.config = config;
        return this;
    }

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }


    public String getHost() {
        return host;
    }

    public RedissonConnection setHost(String host) {
        this.host = host;
        return this;
    }

    public int getPort() {
        return port;
    }

    public RedissonConnection setPort(int port) {
        this.port = port;
        return this;
    }

    public int getTimeout() {
        return timeout;
    }

    public RedissonConnection setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    private String createConnectionAddress(){
        return ConnectionParamsConst.REDISSON_PREFIX + host + ":" + port;
    }
}
