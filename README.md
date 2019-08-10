Gatling's SBT demo
=========================

A simple project showing how to configure and use Gatling's SBT plugin to run Gatling simulations. 


Start SBT
---------
```bash
$ sbt
```

Run all simulations
-------------------

```bash
> gatling:test
```

Run a single simulation
-----------------------

```bash
> gatling:testOnly computerdatabase.BasicSimulation
```

List all tasks
--------------------

```bash
> tasks gatling -v
```