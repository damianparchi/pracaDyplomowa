import React from "react";
import "../Login/Login.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faEnvelope, faKey } from "@fortawesome/free-solid-svg-icons";

export default function Login() {
  return (
    <div className="container">
      <div className="loginForm">
        <div className="tytul">
          <span>Login Form</span>
        </div>
        <form action="#">
          <div className="row">
            <i>
              <FontAwesomeIcon icon={faEnvelope} />
            </i>
            <input type="text" placeholder="E-mail..." required></input>
          </div>
          <div className="row">
            <i>
              <FontAwesomeIcon icon={faKey} />
            </i>
            <input type="password" placeholder="Hasło..." required></input>
          </div>
          <div className="pass">
            <a href="#">Zapomniałeś hasła?</a>
          </div>
          <div className="row button">
            <input type={"submit"} value="Login" />
          </div>
          <div className="signup-link">
            {" "}
            Nie masz konta?
            <a href="/register"> Zarejestruj się!</a>
          </div>
        </form>
      </div>
    </div>
  );
}
