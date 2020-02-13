# var in yaml

Spring Bootアプリケーションのapplication.yaml内の変数の確認用プロジェクトです。
環境変数，システムプロパティ，Spring Bootコマンドライン引数のどれでもapplication.yaml内の変数で受けとれることが確認できます。

application.yaml内で `example.foo.bar` の値に `${BOS_TEST}` という変数を指定しています。
起動時に `example.foo.bar` の値をログ出力します。


## ビルド

```
./gradlew bootjar
```

## 実行

以下のコマンドを実行するとログに `example.foo.bar=` の行に `BOS_TEST` の値が表示されます。

```
# 環境変数
BOS_TEST=envvar java -jar build/libs/var_in_yaml-0.0.1-SNAPSHOT.jar

# システムプロパティ
java -DBOS_TEST=sysprop -jar build/libs/var_in_yaml-0.0.1-SNAPSHOT.jar

# Spring Bootコマンドライン引数
java -jar build/libs/var_in_yaml-0.0.1-SNAPSHOT.jar --BOS_TEST=commandline
```
