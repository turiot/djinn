djinn, the java dependency explorer [![Build Status](https://travis-ci.org/fabienbk/djinn.png?branch=master)](https://travis-ci.org/fabienbk/djinn)
===================================

Description
-----------

A visual tool that creates dependency graphs between arbitrary sets of jars, classes, packages and java projects.

Djinn can be used to :
* Analyze legacy codebases that do not rely on dependency management systems (such as maven or 
ivy) and then produce information that facilitate migration to these systems;
* Locate, and fix cyclic dependencies;
* Understand how a project is structured to gain comprehension quicker.

![screenshot](http://fabienbk.github.io/djinn/images/screens/djinn0.2.0.png)

There is still a lot of work to do - the tool only provides basic functionality currently.

Quick start
-----------

If you don't want to be bothered with building the project:

Here is the latest [runnable jar](http://fabienbk.github.io/djinn/release/djinn-gui.jar).

Alternatively, your can [click here](http://fabienbk.github.io/djinn/jnlp/djinn.jnlp) to run djinn through java webstart.


Building and running
--------------------

The project requires [Maven](http://maven.apache.org/download.cgi) for building, and JDK 7 (or later).
It has been tested under Windows and Linux, although it should run wherever Swing Applications are supported.

To build the runnable jar, simply run:

```bash
mvn compile assembly:single
```

The artifact generated is target/djinn-gui.jar subdirectory. You can run it using :

```bash
java -jar target/djinn-gui.jar
```

If you're a clicky person, flip the executable permission flag, and you should be able to run djinn by double-clicking on the jar, under linux or windows.

Getting Started
---------------

There is a work-in-progress [tutorial here](http://blog.scramcode.com/post/9/explore-java-dependencies-with-djinn/). Stay tuned, better stuff will come soon.

[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/98873eef74ddc5882786fa4036fd5beb "githalytics.com")](http://githalytics.com/fabienbk/djinn)
