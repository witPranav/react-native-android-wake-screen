# react-native-android-wake-screen

## Getting started

`$ npm install react-native-android-wake-screen --save`

### Mostly automatic installation

`$ react-native link react-native-android-wake-screen`

## Usage
This module helps turn the screen display on from within a headless function.

Add the following inside the project manifest (android/app/src/main/AndroidManifest.xml):
```xml
<uses-permission android:name="android.permission.WAKE_LOCK" />
<application
      android:name=".MainApplication"
      android:label="@string/app_name"
      android:icon="@mipmap/ic_launcher"
      android:roundIcon="@mipmap/ic_launcher_round"
      android:allowBackup="false"
      android:turnScreenOn="true"                          // Add this line
      android:theme="@style/AppTheme">
```

```javascript
import AndroidWakeScreen from 'react-native-android-wake-screen';

//inside your headless function
const MyHeadlessFunction = async () => {
  AndroidWakeScreen.wakeScreen();
};
```
