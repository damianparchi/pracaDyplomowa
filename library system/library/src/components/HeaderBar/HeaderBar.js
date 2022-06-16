import React from "react";
import "../HeaderBar/HeaderBar.css";
import { Link } from "react-router-dom";

export default function HeaderBar() {
  return (
    <>
      <div className="headerBar">
        <div className="links">
          <Link className="Link" to="/login">
            Login
          </Link>
          <Link className="Link" to="/register">
            Register
          </Link>
        </div>
      </div>
    </>
  );
}
