package com.gama.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("path_route", r -> r.path("/get").uri("http://httpbin.org"))

				.route("host_route", r -> r.host("*.myhost.org").uri("http://httpbin.org"))
				/*
				 * .route("rewrite_route", r -> r.host("*.rewrite.org").filters(f ->
				 * f.rewritePath("/foo/(?<segment>.*)", "/${segment}"))
				 * .uri("http://httpbin.org")) .route("hystrix_route", r ->
				 * r.host("*.hystrix.org").filters(f -> f.hystrix(c -> c.setName("slowcmd")))
				 * .uri("http://httpbin.org")) .route("hystrix_fallback_route", r ->
				 * r.host("*.hystrixfallback.org").filters( f -> f.hystrix(c ->
				 * c.setName("slowcmd").setFallbackUri("forward:/hystrixfallback")))
				 * .uri("http://httpbin.org")) .route("limit_route", r ->
				 * r.host("*.limited.org").and().path("/anything/**") .filters(f ->
				 * f.requestRateLimiter(c -> c.setRateLimiter(c.getRateLimiter())))
				 * .uri("http://httpbin.org"))
				 */
				.route("productAll", r -> r.path("/rest/allProducts").uri("http://localhost:8890")).build();
	}

	/*
	 * @Bean public GlobalFilter postGlobalFilter() { return (exchange, chain) -> {
	 * return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	 * System.out.println("Global Post Filter executed"); })); }; }
	 */
}