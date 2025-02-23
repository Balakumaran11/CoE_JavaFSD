const countdown = () => {
    const conferenceDate = new Date('2023-12-31').getTime();
    const now = new Date().getTime();
    const difference = conferenceDate - now;

    const days = Math.floor(difference / (1000 * 60 * 60 * 24));
    const hours = Math.floor((difference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    const minutes = Math.floor((difference % (1000 * 60 * 60)) / (1000 * 60));
    const seconds = Math.floor((difference % (1000 * 60)) / 1000);

    document.getElementById('countdown').innerHTML = `${days}d ${hours}h ${minutes}m ${seconds}s`;
};

setInterval(countdown, 1000);