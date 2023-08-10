package org.jetlinks.community.network.security;

import reactor.core.publisher.Mono;

/**
 * 证书管理接口
 *
 * @author Alex Zhang
 */
public interface CertificateManager {

    Mono<Certificate> getCertificate(String id);

}
