function Fruits(props) {
    return (
        <div>
            {props.testfruits.map(f => <p key={f.id}>{f.fruitName}</p>)}
        </div>
    )
}

export default Fruits
