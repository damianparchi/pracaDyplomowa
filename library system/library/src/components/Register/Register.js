import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faRegistered } from "@fortawesome/free-solid-svg-icons";
import "../Register/Register.css";
import img from "../../images/tloregister.png";

export default function Register() {
  return (
    <section className="cont">
      <div className="register">
        <div className="col-1">
          <h2>Zarejestruj się</h2>
          <span>Zarejestruj swoje konto i ciesz się usługą</span>

          <form id="form" className="flex flex-col">
            <input type="text" placeholder="username" />
            <input type="text" placeholder="password" />
            <input type="text" placeholder="confirm password" />
            <input type="text" placeholder="mobile number" />

            <button className="btn">Zarejestruj</button>
          </form>
        </div>
        <div className="col-2">
          <img src={img} alt="" />
        </div>
      </div>
    </section>
  );
}
