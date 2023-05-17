import React, { useState } from 'react';
import axios from 'axios';

const BmiForm = () => {
  const [weight, setWeight] = useState('');
  const [height, setHeight] = useState('');
  const [result, setResult] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.get('http://localhost:8080/calculateBmi', {
        params: {
          weight: weight,
          height: height
        }
      });
      setResult(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label>
          Weight:
          <input type="number" value={weight} onChange={e => setWeight(e.target.value)} />
        </label>
        <label>
          Height:
          <input type="number" value={height} onChange={e => setHeight(e.target.value)} />
        </label>
        <button type="submit">Calculate</button>
      </form>
      {result && <p>BMI: {result.bmi}, Category: {result.category}</p>}
    </div>
  );

};

export default BmiForm;
