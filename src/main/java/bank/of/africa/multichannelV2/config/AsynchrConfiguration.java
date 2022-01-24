package bank.of.africa.multichannelV2.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AsynchrConfiguration {

	@Bean(name="asycExecutor")
	public Executor AsynchrExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		 executor.setMaxPoolSize(3);
		 executor.setCorePoolSize(3);
		 executor.setThreadNamePrefix("asychrTask-");
		 return executor;
	}
}
