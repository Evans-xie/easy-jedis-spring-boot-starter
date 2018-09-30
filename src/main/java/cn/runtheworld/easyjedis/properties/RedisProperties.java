package cn.runtheworld.easyjedis.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xieyihong on 2018/8/17
 */
@ConfigurationProperties(prefix = "easy.jedis", ignoreInvalidFields = true)
@Data
public class RedisProperties {

    private Integer maxIdle = 8;

    private Integer maxTotal = 8;

    private Integer maxWaitMillis = 1000;

    private Integer minEvictableIdleTimeMillis = 1800000;

    private Integer numTestsPerEvictionRun = 100;

    private long timeBetweenEvictionRunsMillis = 30000;

    private boolean testOnBorrow = false;

    private boolean testWhileIdle = false;

    /**
     * 集群的节点
     */
    private String clusterNodes;

    private Integer maxRedirectsac;

    /**
     * Connection timeout.
     */
    private Integer timeout = 2000;

    /**
     * Redis server host.
     */
    private String hostName = "localhost";

    /**
     * Redis server port.
     */
    private Integer port = 6379;

    /**
     * Login password of the redis server.
     */
    private String password;

    /**
     * Database index used by the connection factory.
     */
    private Integer database = 0;
}
