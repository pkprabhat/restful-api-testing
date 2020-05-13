# CashflowProjectionControllerApi

All URIs are relative to *//10.172.120.13:7012/ilm-gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**treasuryRecordsUsingPOST**](CashflowProjectionControllerApi.md#treasuryRecordsUsingPOST) | **POST** /upload/treasury | This service will recieve the file send to read treasury information 

<a name="treasuryRecordsUsingPOST"></a>
# **treasuryRecordsUsingPOST**
> ResponseEntity treasuryRecordsUsingPOST(treasury, dealtype)

This service will recieve the file send to read treasury information 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashflowProjectionControllerApi;


CashflowProjectionControllerApi apiInstance = new CashflowProjectionControllerApi();
File treasury = new File("treasury_example"); // File | 
String dealtype = "dealtype_example"; // String | dealtype
try {
    ResponseEntity result = apiInstance.treasuryRecordsUsingPOST(treasury, dealtype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashflowProjectionControllerApi#treasuryRecordsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **treasury** | **File**|  |
 **dealtype** | **String**| dealtype |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

