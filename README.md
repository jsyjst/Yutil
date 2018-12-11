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
implementation 'com.github.jsyjst:Yutil:v1.0.0'
```
##### 示例：
```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:26.1.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'

    implementation 'com.github.jsyjst:Yutil:v1.0.0'
}
```
License
---
```
Copyright [2018] [jsyjst]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0
       
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
