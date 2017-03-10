

### About Strategy design pattern
> 策略模式定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于算法的客户。 

#### 设计原则

```
1. 分离变化（即算法部分,抽象出接口）
2. 针对接口编程
3. 多用组合，少用继承
```

1. 策略模式定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于算法的客户。 
2. unchangeable part (duck)+ changeable algorithm (flyable) = strategy.
3. strategy dp using combination instead of extends.
4. using interface as field.