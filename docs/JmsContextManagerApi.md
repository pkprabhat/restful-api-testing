# JmsContextManagerApi

All URIs are relative to *//10.172.120.13:7012/ilm-gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registryUsingGET**](JmsContextManagerApi.md#registryUsingGET) | **GET** /registry | registry
[**restartUsingGET**](JmsContextManagerApi.md#restartUsingGET) | **GET** /restart | restart
[**startUsingGET**](JmsContextManagerApi.md#startUsingGET) | **GET** /start | start
[**stopUsingGET**](JmsContextManagerApi.md#stopUsingGET) | **GET** /stop | stop

<a name="registryUsingGET"></a>
# **registryUsingGET**
> String registryUsingGET()

registry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JmsContextManagerApi;


JmsContextManagerApi apiInstance = new JmsContextManagerApi();
try {
    String result = apiInstance.registryUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JmsContextManagerApi#registryUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restartUsingGET"></a>
# **restartUsingGET**
> String restartUsingGET()

restart

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JmsContextManagerApi;


JmsContextManagerApi apiInstance = new JmsContextManagerApi();
try {
    String result = apiInstance.restartUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JmsContextManagerApi#restartUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startUsingGET"></a>
# **startUsingGET**
> String startUsingGET()

start

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JmsContextManagerApi;


JmsContextManagerApi apiInstance = new JmsContextManagerApi();
try {
    String result = apiInstance.startUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JmsContextManagerApi#startUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopUsingGET"></a>
# **stopUsingGET**
> String stopUsingGET()

stop

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JmsContextManagerApi;


JmsContextManagerApi apiInstance = new JmsContextManagerApi();
try {
    String result = apiInstance.stopUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JmsContextManagerApi#stopUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

