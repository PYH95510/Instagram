<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Photogram</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
          integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
</head>

<body>
<div class="container">
    <main class="loginMain">
        <!--sign up-->
        <section class="login">
            <article class="login__form__container">

                <!--sign up form-->
                <div class="login__form">
                    <!--logo-->
                    <h1><img src="/images/logo.jpg" alt=""></h1>
                    <!--logo ends-->

                    <!--input required-->
                    <form class="login__input" action="/auth/signup" method="post">
                        <input type="text" name="username" placeholder="유저네임" required="required" maxlength="30"/>
                        <input type="password" name="password" placeholder="패스워드" required="required" />
                        <input type="email" name="email" placeholder="이메일" required="required" />
                        <input type="text" name="name" placeholder="이름" required="required" />
                        <button>Sign in</button>
                    </form>
                    <!--input end-->
                </div>
                <!--sign up form ends-->

                <!--already member? starts-->
                <div class="login__register">
                    <span>Already has an account?</span>
                    <a href="/auth/signin">Sign in</a>
                </div>
                <!--end of already member form-->

            </article>
        </section>
    </main>
</div>
</body>

</html>