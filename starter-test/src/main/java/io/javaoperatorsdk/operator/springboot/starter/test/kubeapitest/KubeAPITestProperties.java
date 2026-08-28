package io.javaoperatorsdk.operator.springboot.starter.test.kubeapitest;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("javaoperatorsdk.test.kube-api")
public class KubeAPITestProperties {

  private String testDir;
  private String apiServerVersion;
  private Boolean offlineMode;
  private List<String> apiServerFlags;
  private Boolean waitForEtcdHealthCheckOnStartup;
  private Integer startupTimeout;

  public String getTestDir() {
    return testDir;
  }

  public void setTestDir(String testDir) {
    this.testDir = testDir;
  }

  public String getApiServerVersion() {
    return apiServerVersion;
  }

  public void setApiServerVersion(String apiServerVersion) {
    this.apiServerVersion = apiServerVersion;
  }

  public Boolean getOfflineMode() {
    return offlineMode;
  }

  public void setOfflineMode(Boolean offlineMode) {
    this.offlineMode = offlineMode;
  }

  public List<String> getApiServerFlags() {
    return apiServerFlags;
  }

  public void setApiServerFlags(List<String> apiServerFlags) {
    this.apiServerFlags = apiServerFlags;
  }

  public Boolean getWaitForEtcdHealthCheckOnStartup() {
    return waitForEtcdHealthCheckOnStartup;
  }

  public void setWaitForEtcdHealthCheckOnStartup(Boolean waitForEtcdHealthCheckOnStartup) {
    this.waitForEtcdHealthCheckOnStartup = waitForEtcdHealthCheckOnStartup;
  }

  public Integer getStartupTimeout() {
    return startupTimeout;
  }

  public void setStartupTimeout(Integer startupTimeout) {
    this.startupTimeout = startupTimeout;
  }
}
