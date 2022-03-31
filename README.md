# 仿bilibili搜索框效果修改版(三句代码实现)

原作者：[Lam Wan](https://github.com/wenwenwen888)

原项目：[SearchDialog](https://github.com/wenwenwen888/SearchDialog)

## 前言

提高了代码兼容性，方便使用Module来本地代码加载。

将部分显示的文字封装在String里，方便使用。

效果图：

![video4 00-00-08--00-00-38](https://user-images.githubusercontent.com/70384877/161034927-becc564a-3b48-41ed-9541-be69451c414d.gif)



## 使用方式

第一步,实例化:

````java

 SearchFragment searchFragment = SearchFragment.newInstance();
````

第二步,设置回调:

````java

 searchFragment.setOnSearchClickListener(new IOnSearchClickListener() {
            @Override
            public void OnSearchClick(String keyword) {
                //这里处理逻辑
                Toast.makeText(ToolBarActivity.this, keyword, Toast.LENGTH_SHORT).show();
            }
  });
````

第三步,显示搜索框:

````java

   searchFragment.showFragment(getSupportFragmentManager(),SearchFragment.TAG);.
  
````

当前所使用的AndroidStudio版本：2021.1.1 Patch 2

![微信截图_20220331183603](https://user-images.githubusercontent.com/70384877/161046818-0c0acc49-8158-4a6f-a82f-12859b6ad1b9.png)
