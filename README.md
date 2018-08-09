#DialogDemo

![image](http://img.my.csdn.net/uploads/201607/25/1469409327_9559.jpg)

```
BottomMenuDialog.Builder builder = BottomMenuDialog.Builder(MainActivity.this);
builder.setTitle("更换封面");
builder.addMenu("从手机相册选择" ， new View.OnClickListener(){...});
builder.addMenu(...);
BottomMenuDialog dialog = builder.create();
dialog.show();
```