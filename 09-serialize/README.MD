### lombok

Jackson2在初始化序列器时，对pojo类型对象会收集其属性信息，属性包括成员变量及方法，然后属性名称和处理过后的方法名称做为key保存到一个LinkedHashMap中。
收集过程中会调用com.fasterxml.jackson.databind.util.BeanUtil中的legacyManglePropertyName方法用来处理方法名称，它会将get/set方法前缀，即get或set去掉，并将其后面的连续大写字符转换成小写字符返回。
例如: getNEWString会转变成newstring返回。你的属性名称如果有这样的"nSmallSellCount",lombok自动生成的get方法就会是这样的"getNSmallSellCount"，处理过后就是这样的"nsmallSellCount",这与属性nSmallSellCount并不冲突，可以同时存在于HashMap中。
```java
 // lombok getter不兼，手动写getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sId;
    
    public String getsId() {
        return sId;
    }
    
    // lombok generate
    public JacksonDemoVO setSId(final String sId) {
        this.sId = sId;
        return this;
    }
```

需要：`getsId()` -> `sId()` -> `sId`

Lombok：`getSId()` -> `SId()` -> `sid（无法对应）

处理方式：1-手动生成 2-@Jacksonized + @Builder(未成功)
> https://blog.51cto.com/u_15069477/4140818

###