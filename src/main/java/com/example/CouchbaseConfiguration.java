package com.example;

import java.util.List;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;
import com.couchbase.client.spring.cache.CacheBuilder;
import com.couchbase.client.spring.cache.CouchbaseCacheManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CouchbaseConfiguration {

	@Bean
	public Cluster couchbaseCluster() throws Exception {
		return CouchbaseCluster.create(couchbaseEnvironment(),
				"localhost");
	}

	@Bean
	public CouchbaseCacheManager cacheManager() throws Exception {
		return new CouchbaseCacheManager(
				CacheBuilder.newInstance(couchbaseClient())
						.withExpirationInMillis(5000), "foos");
	}

	@Bean
	public DefaultCouchbaseEnvironment couchbaseEnvironment() throws Exception {
		return DefaultCouchbaseEnvironment.builder().build();
	}

	@Bean
	public Bucket couchbaseClient() throws Exception {
		return couchbaseCluster().openBucket("default");
	}

}