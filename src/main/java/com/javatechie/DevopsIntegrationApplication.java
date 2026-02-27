package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		return "<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Harshu's Birthday Login</title>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap');

  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: "Poppins", sans-serif;
  }

  body {
    height: 100vh;
    width: 100vw;
    overflow: hidden;
    /* --- 1. LOVE THEME BACKGROUND --- */
    /* You can replace this gradient with url('your-image.jpg') */
    background: linear-gradient(120deg, #ff9a9e 0%, #fecfef 50%, #a18cd1 100%);
    display: flex;
    justify-content: center;
    align-items: center;
    position: relative;
  }
  
  /* Dark overlay to make text pop */
  body::before {
      content: "";
      position: absolute;
      width: 100%;
      height: 100%;
      background: rgba(0, 0, 0, 0.2); 
      pointer-events: none;
      z-index: -1;
  }

  /* --- 2. FLOATING HEARTS ANIMATION --- */
  .hearts {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    overflow: hidden;
    z-index: 0;
  }

  .hearts li {
    position: absolute;
    display: block;
    list-style: none;
    width: 20px;
    height: 20px;
    bottom: -150px;
    animation: floatUp 25s linear infinite;
  }

  /* Making the shapes look like Hearts using text/emoji for smooth performance */
  .hearts li::before {
    content: "❤"; 
    font-size: 50px;
    color: rgba(255, 255, 255, 0.4);
    text-shadow: 0 0 10px rgba(255, 0, 100, 0.3);
  }

  .hearts li:nth-child(1) { left: 25%; animation-duration: 15s; transform: scale(0.8); }
  .hearts li:nth-child(2) { left: 10%; animation-duration: 20s; animation-delay: 2s; transform: scale(1.2); }
  .hearts li:nth-child(3) { left: 70%; animation-duration: 12s; animation-delay: 4s; }
  .hearts li:nth-child(4) { left: 40%; animation-duration: 18s; animation-delay: 0s; transform: scale(1.5); }
  .hearts li:nth-child(5) { left: 65%; animation-duration: 22s; animation-delay: 0s; transform: scale(0.6); }
  .hearts li:nth-child(6) { left: 85%; animation-duration: 14s; animation-delay: 3s; }
  
  @keyframes floatUp {
    0% { transform: translateY(0) rotate(0deg); opacity: 1; }
    100% { transform: translateY(-1000px) rotate(360deg); opacity: 0; }
  }

  /* --- 3D Login Card Wrapper --- */
  #dobGate {
    display: flex;
    justify-content: center;
    align-items: center;
    perspective: 1000px;
    z-index: 10;
  }

  .card-3d-wrap {
    position: relative;
    width: 350px;
    padding: 50px 30px;
    /* Glassmorphism with a Pink Tint */
    background: rgba(255, 255, 255, 0.1); 
    backdrop-filter: blur(20px);
    -webkit-backdrop-filter: blur(20px);
    border-radius: 20px;
    border: 1px solid rgba(255, 255, 255, 0.4);
    box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
    transform-style: preserve-3d;
    transform: rotateX(0deg) rotateY(0deg);
    transition: transform 0.1s;
    text-align: center;
  }

  /* Decoration line on top */
  .card-3d-wrap::before {
    content: '';
    position: absolute;
    top: -5px;
    left: 50%;
    transform: translateX(-50%);
    width: 60px;
    height: 4px;
    background: #ff4081; /* Pink accent */
    border-radius: 10px;
    box-shadow: 0 0 15px #ff4081;
  }

  h2 {
    color: #fff;
    font-weight: 700;
    margin-bottom: 10px;
    text-shadow: 0 2px 5px rgba(0,0,0,0.2);
    letter-spacing: 1px;
    transform: translateZ(30px);
  }

  .subtitle {
    color: #ffe0e9; /* Light pink text */
    font-size: 0.9rem;
    margin-bottom: 20px;
    transform: translateZ(20px);
  }

  .input-group {
    position: relative;
    margin-bottom: 20px;
    transform: translateZ(20px);
  }

  input {
    width: 100%;
    padding: 12px 20px;
    border-radius: 30px;
    border: 2px solid rgba(255, 255, 255, 0.2);
    background: rgba(255, 255, 255, 0.1);
    color: #fff;
    font-weight: bold;
    font-size: 1.1rem;
    text-align: center;
    outline: none;
    transition: 0.3s;
  }

  input::placeholder {
    color: rgba(255, 255, 255, 0.7);
  }

  input:focus {
    border-color: #ff4081;
    box-shadow: 0 0 10px rgba(255, 64, 129, 0.5);
    background: rgba(0, 0, 0, 0.2);
  }

  button {
    width: 100%;
    padding: 12px;
    border-radius: 30px;
    border: none;
    cursor: pointer;
    font-size: 1rem;
    font-weight: bold;
    color: #fff;
    /* Love gradient button */
    background: linear-gradient(135deg, #ff6b6b, #ff4081);
    box-shadow: 0 5px 15px rgba(255, 64, 129, 0.4);
    transform: translateZ(30px);
    transition: 0.3s;
  }

  button:hover {
    transform: translateZ(35px) scale(1.05);
    box-shadow: 0 0 25px rgba(255, 64, 129, 0.8);
  }

  button:active {
    transform: translateZ(25px) scale(0.95);
  }

  #error {
    color: #ffdde5;
    background: rgba(255, 0, 0, 0.2);
    margin-top: 15px;
    min-height: 24px;
    border-radius: 5px;
    font-weight: 500;
    text-shadow: 0 1px 2px rgba(0,0,0,0.5);
    transform: translateZ(20px);
  }

  /* --- Birthday card section after unlock --- */
  #cardSection {
    position: fixed;
    inset: 0;                /* top:0; right:0; bottom:0; left:0 */
    z-index: 20;

    /* hidden at start, we will show it as flex from JS */
    display: none;

    /* center the card in the screen */
    justify-content: center;
    align-items: center;

    animation: zoomIn 1s ease forwards;

    /* no black background */
    background: transparent;
  }

  #cardSection img {
    width: 1560px;           /* your required size */
    height: 1707px;
    max-width: 100%;         /* if screen is smaller, scale down */
    max-height: 100%;
    object-fit: cover;       /* fill the 1536x730 area nicely */
    display: block;
  }


  @keyframes zoomIn {
    from { opacity: 0; transform: scale(0.5); }
    to { opacity: 1; transform: scale(1); }
  }
</style>
</head>
<body>

<ul class="hearts">
    <li></li><li></li><li></li><li></li><li></li><li></li>
</ul>

<section id="dobGate">
  <div class="card-3d-wrap" id="tiltCard">
    <h2>My Heart Locked 🎁</h2>
    <p class="subtitle">Enter Harshu❤️DOB (DD-MM-YYYY) to open my heart!</p>
    
    <div class="input-group">
      <input id="dobInput" type="text" placeholder="DD-MM-YYYY" autocomplete="off">
    </div>

    <button onclick="checkDOB()">Unlock ❤️</button>
    <div id="error"></div>
  </div>
</section>

<section id="cardSection">
  <img src="harshu-birthday-card.png" alt="Birthday Card for Harshu">
</section>

<script>
  const CORRECT_DOB = "12-12-2003";

  function checkDOB() {
    const userDOB = document.getElementById("dobInput").value.trim();
    const errorBox = document.getElementById("error");
    const card = document.getElementById("tiltCard");

    if (userDOB === CORRECT_DOB) {
      // Success Animation
      card.style.transition = "1s ease";
      card.style.transform = "scale(0) rotate(360deg)";
      card.style.opacity = "0";
      
      setTimeout(() => {
        document.getElementById("dobGate").style.display = "none";
        document.getElementById("cardSection").style.display = "flex";

      }, 800);
    } else {
      // Error Animation
      errorBox.textContent = "Wrong Date! You don't know Harshu? 😢";
      card.style.animation = "shake 0.5s ease";
      setTimeout(() => { card.style.animation = ""; }, 500);
    }
  }

  // 3D Tilt Effect
  const card = document.getElementById("tiltCard");

  document.addEventListener("mousemove", (e) => {
    if (document.getElementById("dobGate").style.display === "none") return;

    let xAxis = (window.innerWidth / 2 - e.pageX) / 25;
    let yAxis = (window.innerHeight / 2 - e.pageY) / 25;
    
    card.style.transform = `rotateY(${xAxis}deg) rotateX(${yAxis}deg)`;
  });

  document.addEventListener("mouseleave", () => {
    card.style.transform = `rotateY(0deg) rotateX(0deg)`;
  });

  // Inject Shake Keyframes for error
  const styleSheet = document.createElement("style");
  styleSheet.innerText = `
    @keyframes shake {
      0% { transform: translateX(0); }
      25% { transform: translateX(-10px) rotateY(-5deg); }
      50% { transform: translateX(10px) rotateY(5deg); }
      75% { transform: translateX(-10px) rotateY(-5deg); }
      100% { transform: translateX(0); }
    }
  `;
  document.head.appendChild(styleSheet);
</script>

</body>
</html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
