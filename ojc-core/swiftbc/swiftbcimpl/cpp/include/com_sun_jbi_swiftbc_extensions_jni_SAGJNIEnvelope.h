/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope */

#ifndef _Included_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
#define _Included_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    alloc
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_alloc
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    free
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_free
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setApplicationId
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setApplicationId
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setContextId
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setContextId
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setMsgFormat
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setMsgFormat
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setSender
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setSender
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setSenderAuth
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setSenderAuth
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setReceiver
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setReceiver
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setLocalAuth
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setLocalAuth
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    setApplicationStatus
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_setApplicationStatus
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getApplicationId
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getApplicationId
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getContextId
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getContextId
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getMsgFormat
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getMsgFormat
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getSender
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getSender
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getSenderAuth
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getSenderAuth
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getReceiver
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getReceiver
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getMsgRef
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getMsgRef
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getLocalAuth
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getLocalAuth
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getApplicationStatus
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getApplicationStatus
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getNamedItemList
 * Signature: ()Lcom/sun/jbi/swiftbc/extensions/SwiftNamedItemList;
 */
JNIEXPORT jobject JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getNamedItemList
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getRoutingListRequest
 * Signature: ()Lcom/sun/jbi/swiftbc/extensions/SwiftRoutingList;
 */
JNIEXPORT jobject JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getRoutingListRequest
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope
 * Method:    getRoutingListResponse
 * Signature: ()Lcom/sun/jbi/swiftbc/extensions/SwiftRoutingList;
 */
JNIEXPORT jobject JNICALL Java_com_sun_jbi_swiftbc_extensions_jni_SAGJNIEnvelope_getRoutingListResponse
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
