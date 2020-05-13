# PostInstallControllerApi

All URIs are relative to *//10.172.120.13:7012/ilm-gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataDictionaryCheckUsingPOST**](PostInstallControllerApi.md#dataDictionaryCheckUsingPOST) | **POST** /dataDictionary | Data Dictionary Check

<a name="dataDictionaryCheckUsingPOST"></a>
# **dataDictionaryCheckUsingPOST**
> Object dataDictionaryCheckUsingPOST(file)

Data Dictionary Check

There are three checks done by this API(Column Datatype, Table existence,Sequence Existence).Datatypes should be input as NUMBER(10,0) NOT AS NUMBER(10) FOR PASSING SUCCESSFULLY

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostInstallControllerApi;


PostInstallControllerApi apiInstance = new PostInstallControllerApi();
File file = new File("file_example"); // File | 
try {
    Object result = apiInstance.dataDictionaryCheckUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostInstallControllerApi#dataDictionaryCheckUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*, application/json

