import logo from './logo.svg'
import './App.css'
import ServiceCard from './Components/ServiceCard'
import { useEffect, useState } from 'react'
import axios from 'axios'



function App() {

  const [data, setData] = useState(null)
    useEffect(() => {
      const fetchData = async () => {
        try {
          const response = await axios.get(
            'http://localhost:8080/api/v1/user/getAllServices'
          )
          setData(response.data)
        } catch (error) {
          console.error('Error fetching data: ', error)
        }
      }

      fetchData()
    }, [])


  console.log(data);
  return (
    <div className="App">
      <div className="flex items-center justify-center  overflow-x-auto shadow-md ">
        <table className="text-sm text-left text-gray-500">
          <thead className="text-xs text-gray-700 uppercase bg-gray-50 ">
            <tr>
              <th scope="col" className="px-6 py-3">
                Service Name
              </th>
              <th scope="col" className="p-4">
                Subscribe/Unsubscribe
              </th>
            </tr>
          </thead>
          <ServiceCard data={data} />
        </table>
      </div>
    </div>
  )
}

export default App
