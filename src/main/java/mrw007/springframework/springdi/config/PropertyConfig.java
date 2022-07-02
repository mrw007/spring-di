package mrw007.springframework.springdi.config;

import mrw007.springframework.springdi.examplebeans.FakeDataSource;
import mrw007.springframework.springdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})

// Added in Spring 4
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;
    @Value("${guru.jms.username}")
    String jmsUsername;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker FakeJmsBroker = new FakeJmsBroker();
        FakeJmsBroker.setUsername(jmsUsername);
        FakeJmsBroker.setPassword(jmsPassword);
        FakeJmsBroker.setUrl(jmsUrl);
        return FakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
