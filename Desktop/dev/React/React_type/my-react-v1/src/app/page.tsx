"use client"; 
import React, {useState} from "react"; 
import Bank from "./bank";
import {BankType} from "./model/bankType"

let data:BankType = {
  name:'회계(會計)',
  category:'Accounting',
  FP:{
    asset :10000,
    liability:-5000,
    equity:15000
  },
  IS:{
    revenue:3000,
    expense:2000
  },
  Assets:[{name:'cash',element:'quickAssets'}, {name:'ordinaryDeposit',element:'quickAssets'}]      
}
    
// export default function Home() {
//타입 스크립트 리턴 값을 컴포넌트로 변환 : React.FC (Function Component) 
const Home:React.FC = () => { 
  const [myBank, setMyBank] = useState<BankType>(data) //제네릭 : 리액트는 useState 안에 들어가는 타입을 몰라! 알려줘! 
  return ( 
    <div className="Page">
      <Bank info={data}></Bank>
    </div>
  );
}

export default Home;