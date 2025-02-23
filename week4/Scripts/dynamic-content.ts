fetch('data/speakers.json')
    .then(response => response.json())
    .then(data => {
        const speakerList = document.getElementById('speaker-list');
        data.forEach(speaker => {
            const li = document.createElement('li');
            li.textContent = `${speaker.name} - ${speaker.topic}`;
            speakerList.appendChild(li);
        });
    });