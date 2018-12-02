# Issue
问题记录

## fat-aar
子AAR的资源ID，打包到apk后ID变了，运行时提示找不到资源id，java.lang.NoClassDefFoundError: Failed resolution of: Lcom/ms/base/R$integer;

## fataar-gradle-plugin
java.lang.NoSuchFieldError: No field abc_action_bar_view_list_nav_layout of type I in class Lcom/android/component/merge/sdk/R$layout; or its superclasses (declaration of 'com.android.component.merge.sdk.R$layout' appears in /data/app/com.android.component-1/base.apk)
解决方案：这个是aar打包了support包的问题，用compileOnly即可