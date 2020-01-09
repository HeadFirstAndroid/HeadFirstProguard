# HeadFirstProguard

Android 混淆


## 如何使用混淆

混淆可针对整个 App 开启，可以配置整个 App 的混淆规则，也可以配置某一个模块的以及某个 SDK 的。

### 开启混淆

#### App 开启混淆

App 开启混淆比较简单，在 buildTypes 里的对应的构建类型里配置 `minifyEnabled true` 即可开启混淆。

```groovy
buildTypes {
    debug {
        minifyEnabled true
        proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
    }
}
```

App 的混淆的规则可以写在 'proguard-rules.pro' 文件里。

 
#### 模块 或 SDK 开启混淆

跟 App 有所不同

### 开启混淆后报错

默认情况下，会把所有代码都混淆掉，如果什么混淆规则都不加的话，连 Activity 都启动不了。

```shell

java.lang.RuntimeException: Unable to instantiate activity ComponentInfo{me.yifeiyuan.headfirstproguard/me.yifeiyuan.headfirstproguard.MainActivity}: java.lang.ClassNotFoundException: Didn't find class "me.yifeiyuan.headfirstproguard.MainActivity" on path: DexPathList[[zip file "/data/app/me.yifeiyuan.headfirstproguard-2/base.apk"],nativeLibraryDirectories=[/data/app/me.yifeiyuan.headfirstproguard-2/lib/arm, /vendor/lib, /system/lib]]
    at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2394)

Suppressed: java.lang.ClassNotFoundException: me.yifeiyuan.headfirstproguard.MainActivity
at java.lang.Class.classForName(Native Method)
at java.lang.BootClassLoader.findClass(ClassLoader.java:781)
at java.lang.BootClassLoader.loadClass(ClassLoader.java:841)
at java.lang.ClassLoader.loadClass(ClassLoader.java:504)
```

## 混淆规则



## 资料
压缩、混淆和优化您的应用：https://developer.android.com/studio/build/shrink-code#optimization