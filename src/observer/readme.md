

### About observer design pattern

> 观察者模式定义了一对多的关系，具体地讲，观察者模式定义了一对多的依赖，这样一来，当一个对象改变状态时，他的所有依赖都收到通知并自动更新。 

#### 设计原则

```
1. 松耦合
```

1. 观察者模式定义了一对多的关系，具体地讲，观察者模式定义了一对多的依赖，这样一来，当一个对象改变状态时，他的所有依赖都收到通知并自动更新。
2. 主题用一个共同的接口来更新观察者。
3. 观察者和主题之间用松耦合方式结合(loosecoupling)，主题并不知道观察者的细节，只知道观察者实现了观察者接口。