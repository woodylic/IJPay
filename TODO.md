# WeComPay TODO

- [X] 添加 IJPay-WeComPay 模块。
  - 命名空间为 `com.ijpay.wecompay`。
  - 下面有 `enums` 和 `model` 两个 package。
  - 根目录下有 `WeComPayApi` 类，作为入口。
- [ ] 初始化 `WeComPayApi` 类，参考[小程序接入对外收款](https://developer.work.weixin.qq.com/document/path/98723)文档，应该有以下方法：
  - createOrder
  - getOrder
  - getSign
  - createRefund
  - closeOrder (later)
  - getRefund (later)
  - verifyNotify (对回调进行验签解密等)
- [ ] 在 IJPay-Demo-SpringBoot 添加 wecompay 模块，提供 demo 代码。
  - 在 `controller` 下添加 `wecompay` 包。
  - 添加 `WeComPayController` 类，作为入口。
  - 从入口开始写，根据需要添加其他类。
