import React from "react";
import BottomBar from "./components/BottomBar/BottomBar";
import HeaderBar from "./components/HeaderBar/HeaderBar";
import Login from "./components/Login/Login";
import "./App.css";
import Register from "./components/Register/Register";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

export default function App() {
  return (
    <>
      <Router>
        <HeaderBar />
        <div className="bar">
          <div className="foo">
            <Routes>
              <Route path="/login" exact element={<Login />} />
              <Route path="/register" exact element={<Register />} />
            </Routes>
          </div>
        </div>
        <BottomBar />
      </Router>
    </>
  );
}
