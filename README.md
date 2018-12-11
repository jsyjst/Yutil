# Yutil
### jsysjt的工具箱
如何添加
--
### Gradle
#### 1.在Project的build.gradle 中添加仓库地址
```
//JitPack仓库
maven { url 'https://jitpack.io' }
```
##### 示例：
```
allprojects {
	repositories {
		...
      		//JitPack仓库
		maven { url 'https://jitpack.io' }
	}
}
```
#### 2.在Module目录下的build.gradle中添加依赖
```
implementation 'com.github.jsyjst:Yutil:Tag'
```
##### 示例：
```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:26.1.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'

    implementation 'com.github.jsyjst:Yutil:Tag'
}
```
