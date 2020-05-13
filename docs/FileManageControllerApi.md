# FileManageControllerApi

All URIs are relative to *//10.172.120.13:7012/ilm-gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAnyByTrackerIDUsingGET**](FileManageControllerApi.md#deleteAnyByTrackerIDUsingGET) | **GET** /deleteanybytrackerid | deleteAnyByTrackerID
[**finMessageUsingPOST**](FileManageControllerApi.md#finMessageUsingPOST) | **POST** /upload/message | This service will recieve the file send to service for process the messages 
[**getAttributeUsingGET**](FileManageControllerApi.md#getAttributeUsingGET) | **GET** /attr | getAttribute
[**getMT103UsingGET**](FileManageControllerApi.md#getMT103UsingGET) | **GET** /getMT103 | This service will get MT103
[**proceesFinMessagesUsingPOST**](FileManageControllerApi.md#proceesFinMessagesUsingPOST) | **POST** /mt/message | This service will recieve the file send to service for process the messages 
[**processRentasFilesUsingGET**](FileManageControllerApi.md#processRentasFilesUsingGET) | **GET** /processrentas | processRentasFiles
[**runBatchUsingGET**](FileManageControllerApi.md#runBatchUsingGET) | **GET** /run/batch | runBatch
[**uploadKPlusFileUsingPOST**](FileManageControllerApi.md#uploadKPlusFileUsingPOST) | **POST** /upload/kplus | uploadKPlusFile

<a name="deleteAnyByTrackerIDUsingGET"></a>
# **deleteAnyByTrackerIDUsingGET**
> CommonResponseEntitystring deleteAnyByTrackerIDUsingGET(trackerId)

deleteAnyByTrackerID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
Long trackerId = 789L; // Long | trackerId
try {
    CommonResponseEntitystring result = apiInstance.deleteAnyByTrackerIDUsingGET(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#deleteAnyByTrackerIDUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Long**| trackerId |

### Return type

[**CommonResponseEntitystring**](CommonResponseEntitystring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="finMessageUsingPOST"></a>
# **finMessageUsingPOST**
> ResponseEntity finMessageUsingPOST(fin)

This service will recieve the file send to service for process the messages 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
File fin = new File("fin_example"); // File | 
try {
    ResponseEntity result = apiInstance.finMessageUsingPOST(fin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#finMessageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fin** | **File**|  |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="getAttributeUsingGET"></a>
# **getAttributeUsingGET**
> CommonResponseEntityMapstringint getAttributeUsingGET()

getAttribute

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
try {
    CommonResponseEntityMapstringint result = apiInstance.getAttributeUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#getAttributeUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommonResponseEntityMapstringint**](CommonResponseEntityMapstringint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMT103UsingGET"></a>
# **getMT103UsingGET**
> ResponseEntity getMT103UsingGET(skey)

This service will get MT103

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
Long skey = 789L; // Long | skey
try {
    ResponseEntity result = apiInstance.getMT103UsingGET(skey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#getMT103UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skey** | **Long**| skey |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="proceesFinMessagesUsingPOST"></a>
# **proceesFinMessagesUsingPOST**
> ResponseEntity proceesFinMessagesUsingPOST(body)

This service will recieve the file send to service for process the messages 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
String body = "body_example"; // String | finMessage
try {
    ResponseEntity result = apiInstance.proceesFinMessagesUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#proceesFinMessagesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| finMessage |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="processRentasFilesUsingGET"></a>
# **processRentasFilesUsingGET**
> processRentasFilesUsingGET()

processRentasFiles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
try {
    apiInstance.processRentasFilesUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#processRentasFilesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="runBatchUsingGET"></a>
# **runBatchUsingGET**
> CommonResponseEntitystring runBatchUsingGET(filePath, timeZone)

runBatch

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
String filePath = "filePath_example"; // String | filePath
String timeZone = "timeZone_example"; // String | timeZone
try {
    CommonResponseEntitystring result = apiInstance.runBatchUsingGET(filePath, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#runBatchUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| filePath |
 **timeZone** | **String**| timeZone |

### Return type

[**CommonResponseEntitystring**](CommonResponseEntitystring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="uploadKPlusFileUsingPOST"></a>
# **uploadKPlusFileUsingPOST**
> CommonResponseEntitystring uploadKPlusFileUsingPOST(kplus, dealtp)

uploadKPlusFile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FileManageControllerApi;


FileManageControllerApi apiInstance = new FileManageControllerApi();
File kplus = new File("kplus_example"); // File | 
String dealtp = "dealtp_example"; // String | dealtp
try {
    CommonResponseEntitystring result = apiInstance.uploadKPlusFileUsingPOST(kplus, dealtp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileManageControllerApi#uploadKPlusFileUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kplus** | **File**|  |
 **dealtp** | **String**| dealtp |

### Return type

[**CommonResponseEntitystring**](CommonResponseEntitystring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

