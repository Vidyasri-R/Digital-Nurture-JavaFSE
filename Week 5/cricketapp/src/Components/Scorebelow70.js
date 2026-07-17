import React from 'react';

function Scorebelow70(props) {
    const { players } = props;
    let players70 = [];
    return (
        <div>
            {players.map((item) => {
                if (item.score <= 70) {
                    players70.push(item);
                }
            })}
            {players70.map((item) => {
                return (
                    <div key={item.name}>
                        <li>Mr. {item.name} {item.score}</li>
                    </div>
                )
            })}
        </div>
    )
}
export default Scorebelow70;
