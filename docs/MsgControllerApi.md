# MsgControllerApi

All URIs are relative to *//10.172.120.13:7012/ilm-gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send1UsingGET**](MsgControllerApi.md#send1UsingGET) | **GET** /send1 | send1
[**send2UsingGET**](MsgControllerApi.md#send2UsingGET) | **GET** /send2 | send2
[**send3UsingPOST**](MsgControllerApi.md#send3UsingPOST) | **POST** /msg | send3

<a name="send1UsingGET"></a>
# **send1UsingGET**
> String send1UsingGET(value)

send1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsgControllerApi;


MsgControllerApi apiInstance = new MsgControllerApi();
String value = "value_example"; // String | value
try {
    String result = apiInstance.send1UsingGET(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgControllerApi#send1UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| value |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="send2UsingGET"></a>
# **send2UsingGET**
> String send2UsingGET()

send2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsgControllerApi;


MsgControllerApi apiInstance = new MsgControllerApi();
try {
    String result = apiInstance.send2UsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgControllerApi#send2UsingGET");
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

<a name="send3UsingPOST"></a>
# **send3UsingPOST**
> String send3UsingPOST(body)

send3

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsgControllerApi;


MsgControllerApi apiInstance = new MsgControllerApi();
String body = "body_example"; // String | msg
try {
    String result = apiInstance.send3UsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgControllerApi#send3UsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| msg |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

