// import React from 'react';

// const ServiceCard = ({ data }) => {
//   if (!data) {
//     return <div>Loading...</div>;
//   }

//   return (
//     <>
//       <tbody>
//         {data.map((item, index) => (
//           <tr className="bg-white border-b hover:bg-gray-50 " key={index}>
//             <th
//               scope="row"
//               className="px-6 py-4 font-medium text-gray-900 whitespace-nowrap"
//             >
//               {item.serviceName}
//             </th>
//             <td className="w-3 p-3">
//               <div className="flex items-center">
//                 <input
//                   id={`checkbox-table-search-${index}`}
//                   type="checkbox"
//                   className="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2 "
//                 />
//                 <label htmlFor={`checkbox-table-search-${index}`} className="sr-only">
//                   checkbox
//                 </label>
//               </div>
//             </td>
//           </tr>
//         ))}
//       </tbody>
//     </>
//   );
// };

// export default ServiceCard;

import React from 'react'
import axios from 'axios'

const ServiceCard = ({ data }) => {
  if (!data) {
    return <div>Loading...</div>
  }

const handleCheckboxChange = async (item, isChecked) => {
  try {
    if (isChecked) {
      const response = await axios.post(
        `http://localhost:8080/api/v1/user/activateService/user3/${item.serviceId}`
      )
      console.log(response.data)
    } else {
      const response = await axios.delete(
        `http://localhost:8080/api/v1/user/deactivateService/user3/${item.serviceId}`
      )
      console.log(response.data)
    }
  } catch (error) {
    console.error('Error updating service: ', error)
  }
}

  return (
    <>
      <tbody>
        {data.map((item, index) => (
          <tr className="bg-white border-b hover:bg-gray-50 " key={index}>
            <th
              scope="row"
              className="px-6 py-4 font-medium text-gray-900 whitespace-nowrap"
            >
              {item.serviceName}
            </th>
            <td className="w-3 p-3">
              <div className="flex items-center">
                <input
                  id={`checkbox-table-search-${index}`}
                  type="checkbox"
                  className="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2 "
                  onChange={(e) => handleCheckboxChange(item, e.target.checked)}
                />
                <label
                  htmlFor={`checkbox-table-search-${index}`}
                  className="sr-only"
                >
                  checkbox
                </label>
              </div>
            </td>
          </tr>
        ))}
      </tbody>
    </>
  )
}

export default ServiceCard

