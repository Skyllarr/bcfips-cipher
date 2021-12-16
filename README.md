# Cipher suite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 supported in FIPS mode

run example:

```console
mvn compile
mvn exec:exec
```

You should see the output:

```console
Provider of SSL Context is: SunJSSE
TLS_DHE_DSS_WITH_AES_128_CBC_SHA is among supported cipher suites: false
Sun JSSE provider (FIPS mode, crypto provider SunPKCS11-testFipsPkcs)
```
