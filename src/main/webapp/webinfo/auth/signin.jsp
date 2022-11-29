<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PhotoStaGram</title>

    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
          integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
</head>

<body>
<div class="container">
    <main class="loginMain">
        <!--login section-->
        <section class="login">
            <!--login box-->
            <article class="login__form__container">
                <!--login form-->
                <div class="login__form">
                    <h1><img src="/images/logo.jpg" alt=""></h1>

                    <!--login input-->
                    <form class="login__input" action="/login" method="post"><!--action signin POST method--> <
                        <input type="text" name="username" placeholder="유저네임" required="required" />
                        <input type="password" name="password" placeholder="비밀번호" required="required" />
                        <button>Sign In</button>
                    </form>
                    <!--sign in input end-->
                    <!-- or -->
                    <div class="login__horizon">
                        <div class="br"></div>
                        <div class="or">or</div>
                        <div class="br"></div>
                    </div>
                    <!-- or form end -->

                    <!-- Oauth social sign in -->
                    <div class="login__facebook">
                        <button>
                            <i class="fab fa-facebook-square"></i>
                            <span>Sign in with FaceBook</span>
                        </button>
                    </div>
                    <!-- Oauth Social sign in -->
                </div>

                <!--Doesn't have an account?-->
                <div class="login__register">
                    <span>Not a member yet?</span>
                    <a href="/auth/signup">Sign Up</a>
                </div>
                <!--Not a member yet?end-->
            </article>
        </section>
    </main>

</div>
</body>

</html>