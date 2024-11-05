/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      fontFamily: {
        comfortaa: ['Comfortaa', 'sans-serif'],
      },
      colors: {
        "primary": {
          50: "#ffffff",
          100: "#f2eef6",
          200: "#f0ecf5",
          300: "#e1daec",
          400: "#d2c7e2",
          500: "#c4b5d9",
          600: "#b5a4cf",
          700: "#a692c6",
          800: "#9781bc",
          900: "#8970b3",
          950: "#7a60a9",
        },
        "primary-dark":{
          50: "#000000",
          100: "#050407",
          200: "#09090d",
          300: "#0d0d12",
          400: "#111116",
          500: "#14141a",
          600: "#16161d",
          700: "#191921",
          800: "#1b1b24",
          900: "#1e1e28",
          950: "#20202c",
        }
      }
    },
  },
  plugins: [],
}