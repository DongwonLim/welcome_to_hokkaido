@import url("https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap");

/* CSS 변수 */
:root {
  --body-font: "Noto Sans KR", sans-serif;

  /* Color */
  --white-color: #ffffff;
  --black-color: #141414;
  --grey-color: #616161;
  --blue-color: #0336ff;
  --red-color: #b71c1c;

  /* Brand Colors */
  --primary-color: green;
  --secondary-color: #26a69a;
  --accent-color: #9c27b0;
  --positive-color: #21ba45;
  --negative-color: var(--red-color);
  --info-color: #31ccec;
  --warning-color: #f2c037;
  --dark-color: #1d1d1d;

  /* Font Weight */
  --font-weight-light: 200;
  --font-weight-medium: 400;
  --font-weight-bold: 700;
  --font-weight-black: 900;

  /* Typography */
  --font-size-1: 3.5rem;
  --font-size-2: 2.5rem;
  --font-size-3: 2rem;
  --font-size-4: 1.5rem;
  --font-size-5: 1rem;
  --font-size-6: 0.875rem;

  /* Spacing */
  --spacing-1: 1rem;
  --spacing-2: 2rem;
  --spacing-3: 2.5rem;
  --spacing-4: 3rem;
  --spacing-5: 4rem;

  --header-height: 4.5rem;
}
body {
  font-family: var(--body-font);
  color: var(--black-color);
  font-size: var(--font-size-5);
  margin-top: var(--header-height);
}

.font-weight-light {
  font-weight: var(--font-weight-light);
}
.font-weight-medium {
  font-weight: var(--font-weight-medium);
}
.font-weight-bold {
  font-weight: var(--font-weight-bold);
}
.font-weight-black {
  font-weight: var(--font-weight-black);
}

/* Layout */
.container {
  max-width: 1024px;
  margin: 0 auto;
  padding: 0 var(--spacing-1);
}

/* Header */
.header {
  background-color: var(--dark-color);
  color: var(--white-color);
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 100;
  a {
    color: inherit;
    text-decoration: none;
  }
}

.nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-weight: var(--font-weight-black);
  height: var(--header-height);
}

.nav__logo {
  display: flex;
  align-items: center;
  gap: 0.5rem;
}

.nav__img {
  width: 42px;
  height: 42px;
}

.nav__brand {
  font-size: var(--font-size-5);
}

.nav__list {
  display: flex;
}

.nav__item {
  margin-left: var(--spacing-3);
}

.nav__link {
  position: relative;
}

.active-link::after,
.nav__link:hover::after {
  background-color: var(--primary-color);
  height: 0.18rem;
  content: "";
  width: 100%;
  position: absolute;
  left: 0;
  top: 2rem;
}

/* Home */
.home {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding-top: var(--spacing-5);
  padding-bottom: var(--spacing-5);
}

.home__title {
  font-size: var(--font-size-2);
  line-height: calc(var(--font-size-2) * 1.4);
  font-weight: var(--font-weight-black);
  margin-bottom: var(--spacing-3);
}

.home__title-color {
  color: var(--primary-color);
}

.home__img {
  border-radius: 2rem;
  width: 520px;
}
.home__social {
  margin-top: var(--spacing-3);
  display: flex;
  column-gap: var(--spacing-1);
}
.home__social-icon {
  font-size: 1.5rem;
  transition: 0.3s;
  color: var(--black-color);
}
.home__social-icon:hover {
  color: var(--primary-color);
}

/* Button style */
.button {
  display: inline-block;
  background-color: var(--primary-color);
  color: white;
  padding: 0.75rem 1.75rem;
  font-weight: var(--font-weight-bold);
  border-radius: 0.5rem;
  transition: 0.3s;
}
.button:hover {
  box-shadow: var(--box-shadow-2);
}

/* section */
.section {
  padding-top: calc(var(--header-height) + 1rem);
  padding-bottom: calc(var(--header-height) + 1rem);
}

.section__title {
  font-size: var(--font-size-3);
  color: var(--primary-color);
  text-align: center;
  font-weight: var(--font-weight-black);
  margin-bottom: var(--spacing-5);
  position: relative;
}
.section__title::after {
  position: absolute;
  content: "";
  width: 64px;
  height: 0.25rem;
  background-color: var(--primary-color);
  left: 0;
  right: 0;
  top: 3rem;
  margin: 0 auto;
}

.bg-grey-1 {
  background-color: #f6f6f6;
}
.bg-dark {
  background-color: var(--dark-color);
}

/* About */
.about__container {
  display: flex;
  align-items: center;
  column-gap: 3rem;
}
.about__subtitle {
  font-size: var(--font-size-4);
  font-weight: var(--font-weight-bold);
  margin-bottom: var(--spacing-2);
}
.about__text {
  line-height: 1.4rem;
}

.about__img {
  max-width: 380px;
  border-radius: 0.5rem;
}

/* 식당, 이자카야 */
.restaurants__container {
  display: flex;
  align-items: center;
  column-gap: 3rem;
}
.restaurants__img {
  max-width: 400px;
  border-radius: 0.5rem;
  transition: 0.5s;
}

.restaurants__img:hover {
  transform: scale(1.05);
}

.restaurants__subtitle {
  font-size: var(--font-size-4);
  font-weight: var(--font-weight-bold);
  margin-bottom: var(--spacing-1);
}

.restaurants__text {
  line-height: 1.4rem;
}

.restaurants__names {
  display: flex;
  align-items: center;
}

/* 카페 */

.cafe__container {
  display: flex;
  align-items: center;
  column-gap: 3rem;
}

.cafe__subtitle {
  font-size: var(--font-size-4);
  font-weight: var(--font-weight-bold);
  margin-bottom: var(--spacing-1);
}
.cafe__text {
  line-height: 1.4rem;
}

.cafe__img {
  max-width: 380px;
  transition: 0.5s;
  display: block;
  border-radius: 0.5rem;
}

.cafe__img:hover {
  transform: scale(1.05);
}

/* 캠핑장 */

.camp__container {
  display: flex;
  flex-direction: row-reverse;
  align-items: center;
  column-gap: 3rem;
}
.camp__subtitle {
  font-size: var(--font-size-4);
  font-weight: var(--font-weight-bold);
  margin-bottom: var(--spacing-2);
}
.camp__text {
  line-height: 1.4rem;
}

.camp__img {
  max-width: 380px;
  border-radius: 0.5rem;
  transition: 0.5s;
}

.camp__img:hover {
  transform: scale(1.05);
}

/* 여행지 */
.trip__container {
  display: flex;
  align-items: center;
  column-gap: 3rem;
}
.trip__subtitle {
  font-size: var(--font-size-4);
  font-weight: var(--font-weight-bold);
  margin-bottom: var(--spacing-2);
}
.trip__text {
  line-height: 1.4rem;
}

.trip__img {
  max-width: 380px;
  border-radius: 0.5rem;
  transition: 0.5s;
}

.trip__img:hover {
  transform: scale(1.05);
}
/* contact */
.contact__container {
  display: flex;
  justify-content: center;
}
.contact__form {
  width: 360px;
}
.contact__input {
  width: 100%;
  outline: none;
  border: 1.5px solid var(--dark-color);
  padding: 1rem;
  border-radius: 0.5rem;
  margin-bottom: var(--spacing-1);
  font-size: var(--font-size-6);
  font-weight: var(--font-weight-bold);
}

.contact__button {
  margin-left: auto;
  display: block;
}

/* Footer */
.footer {
  background-color: var(--dark-color);
  color: var(--white-color);
  text-align: center;
  padding: 3rem 0;
  font-weight: var(--font-weight-bold);
}
.footer__title {
  font-size: 1.75rem;
  margin-bottom: var(--spacing-4);
}

.footer__social {
  display: flex;
  justify-content: center;
  column-gap: 2rem;
  margin-bottom: var(--spacing-4);
}

.footer__icon {
  font-size: 1.2rem;
  color: white;
}

.footer__copy {
  font-size: var(--font-size-6);
  font-weight: var(--font-weight-medium);
}

/* Floating Button*/
.floationg-button {
  position: fixed;
  bottom: 20px;
  right: 20px;
  color: var(--white-color);
  background-color: var(--primary-color);
  width: 50px;
  height: 50px;
  border-radius: 50%;
  cursor: pointer;
  box-shadow: var(--box-shadow-1);
  transition: 0.3s;
}

.floationg-button:hover {
  background-color: var(--dark-color);
}

.floationg-button-icon {
  font-size: 1.2rem;
}

.nav__togle {
  display: none;
}
.show {
  right: 0 !important;
}

/* Mobile */
@media only screen and (max-width: 768px) {
  :root {
    --font-size-1: 2rem;
    --font-size-2: 1.75rem;
    --font-size-3: 1.5rem;
    --font-size-4: 1.25rem;
    --font-size-5: 0.938rem;
    --font-size-6: 0.75em;
    --header-height: 3rem;
  }
  .nav__toggle {
    display: block;
    cursor: pointer;
    padding: 0.5rem;
  }
  .nav__menu {
    position: fixed;
    background-color: var(--dark-color);
    height: 100%;
    width: 80%;
    top: var(--header-height);
    right: -100%;
    padding: 2rem;
    transition: 0.2s;
  }
  .nav__list {
    display: block;
  }
  .nav__item {
    margin-left: 0;
    margin-bottom: var(--spacing-4);
  }

  /* Home */
  .home {
    flex-direction: column-reverse;
    text-align: center;
  }
  .home__social {
    justify-content: center;
  }
  .home__title {
    margin-top: var(--spacing-3);
  }

  /* About */
  .about__container {
    flex-direction: column;
    text-align: center;
  }
  .about__subtitle {
    margin-top: var(--spacing-2);
  }

  /* restaurants */
  .restaurants__container {
    flex-direction: column-reverse;
    text-align: center;
  }
  .restaurants__subtitle {
    margin-top: var(--spacing-2);
  }
  /* 캠핑장 */
  .camp__container {
    flex-direction: column;
    text-align: center;
  }
  .camp__subtitle {
    margin-top: var(--spacing-2);
  }

  /* 여행지 */
  .trip__container {
    flex-direction: column;
    text-align: center;
  }
  .trip__subtitle {
    margin-top: var(--spacing-2);
  }

  /* cafe */
  .cafe__container {
    flex-direction: column;
    text-align: center;
  }
  .cafe__subtitle {
    margin-top: var(--spacing-2);
  }
}