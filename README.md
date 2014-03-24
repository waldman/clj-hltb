clj-hltb
========

This is a Clojure port of the hltb tool (https://github.com/fenak/hltb).

It was developed by a friend as a way to play with Go, and I did the same as a way to play with Clojure. :)

From the original tool README:
```
hltb is a simple tool written in Go for fetching data from http://howlongtobeat.com.
```

#### Usage

```
java -jar clj-hltb-1.0.0-SNAPSHOT-standalone.jar "Awesome Game Name"
```

#### Building

In order to build it on your system, you need the following packages installed:
- leiningen

Then, with the packages above installed, go to the cloned folder and run:
```
$ lein uberjar 
```

This will fetch aditional libs, load the code and prepare the jar file in the target folder.