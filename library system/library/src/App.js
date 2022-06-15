import React from "react";
import BottomBar from "./components/BottomBar/BottomBar";
import HeaderBar from "./components/HeaderBar/HeaderBar";
import Login from "./components/Login/Login";
import "./App.css";
import Register from "./components/Register/Register";

export default function App() {
  return (
    <div className="bar">
      <div className="foo">
        <HeaderBar />
        <BottomBar />
        {/* <Login /> */}
        <Register />
      </div>
    </div>
  );
}
