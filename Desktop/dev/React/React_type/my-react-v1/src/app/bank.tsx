import React from "react"
import { BankType } from "./model/bankType"

interface OwnProps{
    info:BankType
}

const Bank:React.FC<OwnProps> = ({info}) => {
    return (
        <div>{info.FP.equity.valueOf()}</div>
    )
}

export default Bank