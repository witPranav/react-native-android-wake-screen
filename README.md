# react-native-android-wake-screen

## Getting started

`$ npm install react-native-android-wake-screen --save`

### Mostly automatic installation

`$ react-native link react-native-android-wake-screen`

## Usage
Add the following inside the project manifest (android/app/src/main/AndroidManifest.xml):
```xml
<uses-permission android:name="android.permission.WAKE_LOCK" />
```

```javascript
import AndroidWakeScreen from 'react-native-android-wake-screen';

// TODO: What to do with the module?
inside your headless function
const MyHeadlessFunction = async () => {
  AndroidWakeScreen.wakeScreen();
};
```
