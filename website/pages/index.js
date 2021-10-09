import Head from "next/head";
export default function Home() {
	return (
		<div class="">
			<div class="ml-[12.5%] mt-7 rounded-2xl shadow-sm hover:shadow-md hover:scale-[100.5%] transition-all ease-in-out w-[75%] h-[10vh] bg-gradient-to-r from-purple-600 to-indigo-600 flex items-center justify-between">
				<h1 class="select-none text-white text-4xl font-extrabold ml-12">Computer Science A Notes</h1>

				<div class="transform hover:scale-105 transition-all ease-in-out cursor-pointer flex px-4 py-2 bg-white bg-opacity-20 rounded-xl mr-12 divide-x-2 divide-opacity-50 divide-white">
					<div class="pr-3">
						<svg class="h-6 w-6" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="#fff">
							<path stroke-linecap="round" stroke-linejoin="round" stroke-width="3" d="M16 12a4 4 0 10-8 0 4 4 0 008 0zm0 0v1.5a2.5 2.5 0 005 0V12a9 9 0 10-9 9m4.5-1.206a8.959 8.959 0 01-4.5 1.207" />
						</svg>
					</div>
					<a href="https://twitter.com/armeetjatyani" target="none" class="pl-3 text-white font-mono font-extrabold text-xl">
						armeetjatyani
					</a>
				</div>
			</div>

			<div class="flex justify-center mt-12">
				<div class="transform hover:scale-105 px-4 py-2 rounded-2xl bg-purple-200">
					<h2 class="font-bold text-3xl text-transparent bg-gradient-to-tr from-purple-600 to-indigo-600 bg-clip-text">Unit 2</h2>
				</div>
			</div>
		</div>
	);
}
