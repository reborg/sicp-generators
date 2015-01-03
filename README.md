# sicp-generators

A [lein-generate](https://github.com/weavejester/lein-generate) plugin to generate test, paragraph or exercise files
useful when studying [SICP](http://mitpress.mit.edu/sicp) in Clojure. This plugin assumes you created the usual leiningen project
to solve the SICP exercises or simply to follow along paragraph.

## Usage

Just add:

```
:plugins [[lein-gen "0.2.1"]]
```

to your projet file and a generators section:

```
:generators [[sicp-generators "0.1.0"]]
```

Then create a test/paragraph version or test/exercise version with the following:

```
lein generate exercise 1-1
lein generate paragraph counting-change
```

The first example will create two files, src/sicp/exercises/1\_1.clj and related test/sicp/exercises/1\_1\_test.clj.
The second example will create two files, src/sicp/paragraphs/counting\_change.clj and related test/sicp/paragraphs/counting\_changes\_test.clj

## package root option

By default "sicp" is the name of the initial classpath root for generated files. To change that into something else use:

```
lein generate exercise 1-1 my-sicp
```

The additional "my-sicp" argument changes the root package of generated files (and ns declaration into: src/my\_sicp/ and test/my\_sicp.

## test framework

By default the generated test stub uses clojure.test. You can also use [midje](https://github.com/marick/Midje) stubs using:

```
lein generate exercise 1-1 my-sicp midje
```

resulting in the generation of a midje test stub requiring the related src file.

## Help

Type

```
lein help generate
```

to see what templates and options are available.

## License

Copyright © 2015 Renzo Borgatti <http://reborg.net>
Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
