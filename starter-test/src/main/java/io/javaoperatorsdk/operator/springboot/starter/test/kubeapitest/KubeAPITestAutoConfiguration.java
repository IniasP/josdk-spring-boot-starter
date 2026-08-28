package io.javaoperatorsdk.operator.springboot.starter.test.kubeapitest;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

import io.javaoperatorsdk.operator.springboot.starter.OperatorAutoConfiguration;

@AutoConfiguration(before = OperatorAutoConfiguration.class)
@Import(KubeAPITestConfiguration.class)
public class KubeAPITestAutoConfiguration {
}
