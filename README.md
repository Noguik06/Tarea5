# Relative Size Range App

 Java app to calculate Relative size range, which can easily be deployed to Heroku.





## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/fh127/RelativeSizeRangeApp
$ cd RelativeSizeRangeApp
$ mvn clean install
$ heroku login
$ heroku create
$ heroku local web
```

## unit testing

run unit test

```sh
mvn test
```



Your app should now be running on local [localhost:5000](http://localhost:5000/).
```
http://localhost:5000/RelativeSizeRangeExamples
```

## Deploying to Heroku

Your app should now be running on heroku with this link
```
https://peaceful-thicket-58494.herokuapp.com/RelativeSizeRangeExamples
```


```sh
$ heroku create
$ git push heroku master
$ heroku ps:scale web=1
$ heroku open
```

## Documentation

tener en cuenta
-Tener en cuenta, en algunos equipos puede tener dificultad con los permisos de administrador 
```sh
$ sudo su
```

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
